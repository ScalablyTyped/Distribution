package typings.vitalsigns

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.vitalsigns.mod.vitalsigns.ConstraintWrapper
import typings.vitalsigns.mod.vitalsigns.Monitor
import typings.vitalsigns.mod.vitalsigns.MonitorField
import typings.vitalsigns.mod.vitalsigns.Options
import typings.vitalsigns.mod.vitalsigns.ReportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * VitalSigns instance.
    */
  @JSImport("vitalsigns", JSImport.Namespace)
  @js.native
  /**
    * Constructor.
    * @constructors
    * @param {Options} [options] Options.
    */
  class ^ () extends VitalSigns_ {
    def this(options: Options) = this()
  }
  
  /**
    * VitalSigns instance.
    */
  @js.native
  trait VitalSigns_ extends StObject {
    
    /**
      * Pushes a health constraint onto this instance's constraint array.
      * Health constraints define scenarios in which VitalSigns will consider the application to be in an unhealthy state.
      * @param {} constraint A constraint.
      */
    def addConstraint(): Unit = js.native
    
    /**
      * Destroys this VitalSigns instance.
      */
    def destroy(): Unit = js.native
    
    /**
      * Gets a request handler.
      * @type {RequestHandler}
      */
    def express(req: Request[ParamsDictionary, _, _, Query], res: Response[_, Double], next: NextFunction): js.Any = js.native
    /**
      * Gets a request handler.
      * @type {RequestHandler}
      */
    @JSName("express")
    var express_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * Retrieves an array of human-readable messages that define the specific health constraints that failed when running the last health check.
      * @returns {Array<string>} An array of failure messages.
      */
    def getFailed(): js.Array[String] = js.native
    
    /**
      * Gets a report of all monitors, their fields, and the values of those fields, compiled into Javascript object form.  Additionally, a 'healthy' field is
      * attached. This field will be boolean true if all health constraints passed; false otherwise.
      * @param {ReportOptions} [options] A mapping of options to customize this report.
      * @return {Object} The full health report.
      */
    def getReport(): js.Object = js.native
    def getReport(options: ReportOptions): js.Object = js.native
    
    /**
      * Generates a health report and checks each health constraint against it. Any constraints that fail will be added to the 'failed' array in the form of
      * a human-readable failure message, which can be retrieved with {@link #getFailed}.
      * @param {Object} [report] A report object on which to run the health constraints. If omitted, this function will generate a health report automatically.
      * @return {boolean} true if all health constraints passed; false otherwise.
      */
    def isHealthy(): Boolean = js.native
    def isHealthy(report: js.Object): Boolean = js.native
    
    /**
      * Registers monitor.
      * @param {string} monitorName A monitor name.
      * @param {MonitorField} [field] Options.
      */
    def monitor(monitor: String): Unit = js.native
    def monitor(monitor: String, field: MonitorField): Unit = js.native
    def monitor(monitor: js.Object): Unit = js.native
    def monitor(monitor: js.Object, field: MonitorField): Unit = js.native
    def monitor(monitor: Monitor): Unit = js.native
    def monitor(monitor: Monitor, field: MonitorField): Unit = js.native
    
    /**
      * Defines a new health constraint in a chainable, more easily readable format.
      * When called with the monitor name and field name of concern, a wrapper is
      * returned that allows the constraint to be built out with function calls.
      * @param {string} monitorName A monitor name.
      * @param {string} fieldName A field name.
      * @return {ConstraintWrapper} The constraint wrapper.
      */
    def unhealthyWhen(monitorName: String, fieldName: String): ConstraintWrapper = js.native
  }
  
  object vitalsigns {
    
    @js.native
    trait Constraint extends StObject {
      
      /**
        * The comparator to use when comparing the field's value with the constraint value.
        * Valid comparators are: 'equal', 'greater', and 'less'.
        * @type {string}
        */
      var comparator: String = js.native
      
      /**
        * The name of the field to be constrained.
        * @type {string}
        */
      var field: String = js.native
      
      /**
        * The name of the monitor containing the field to be constrained.
        * @type {string}
        */
      var monitor: String = js.native
      
      /**
        * true to negate the outcome of the comparison; false or omitted to use the comparison result.
        * @type {boolean}
        */
      var negate: js.UndefOr[Boolean] = js.native
      
      /**
        * The value against which the field should be compared.
        * @type {any}
        */
      var value: js.Any = js.native
    }
    object Constraint {
      
      @scala.inline
      def apply(comparator: String, field: String, monitor: String, value: js.Any): Constraint = {
        val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Constraint]
      }
      
      @scala.inline
      implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonitor(value: String): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
        
        @scala.inline
        def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ConstraintWrapper extends StObject {
      
      @JSName("equals")
      var equals_FConstraintWrapper: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
      
      var greaterThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
      
      var lessThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
      
      var not: js.UndefOr[ConstraintWrapper] = js.native
    }
    object ConstraintWrapper {
      
      @scala.inline
      def apply(): ConstraintWrapper = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConstraintWrapper]
      }
      
      @scala.inline
      implicit class ConstraintWrapperMutableBuilder[Self <: ConstraintWrapper] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEquals_(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
        
        @scala.inline
        def setGreaterThan(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "greaterThan", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
        
        @scala.inline
        def setLessThan(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
        
        @scala.inline
        def setNot(value: ConstraintWrapper): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      }
    }
    
    @js.native
    trait Monitor extends StObject {
      
      /**
        * Connections.
        * @type {any}
        */
      var connections: js.Any = js.native
    }
    object Monitor {
      
      @scala.inline
      def apply(connections: js.Any): Monitor = {
        val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
        __obj.asInstanceOf[Monitor]
      }
      
      @scala.inline
      implicit class MonitorMutableBuilder[Self <: Monitor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnections(value: js.Any): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MonitorField extends StObject {
      
      /**
        * Name.
        * @type {string}
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Units.
        * @type {string}
        */
      var units: js.UndefOr[String] = js.native
    }
    object MonitorField {
      
      @scala.inline
      def apply(): MonitorField = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MonitorField]
      }
      
      @scala.inline
      implicit class MonitorFieldMutableBuilder[Self <: MonitorField] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Number of milliseconds to wait between automatic health checks.
        * @type {number|boolean}
        */
      var autoCheck: js.UndefOr[Double | Boolean] = js.native
      
      /**
        * HTTP response code to send back in the VitalSigns.
        * @type {number}
        */
      var httpHealthy: js.UndefOr[Double] = js.native
      
      /**
        * HTTP response code to send back in the VitalSigns.
        * @type {number}
        */
      var httpUnhealthy: js.UndefOr[Double] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoCheck(value: Double | Boolean): Self = StObject.set(x, "autoCheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCheckUndefined: Self = StObject.set(x, "autoCheck", js.undefined)
        
        @scala.inline
        def setHttpHealthy(value: Double): Self = StObject.set(x, "httpHealthy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpHealthyUndefined: Self = StObject.set(x, "httpHealthy", js.undefined)
        
        @scala.inline
        def setHttpUnhealthy(value: Double): Self = StObject.set(x, "httpUnhealthy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUnhealthyUndefined: Self = StObject.set(x, "httpUnhealthy", js.undefined)
      }
    }
    
    /**
      * Report options.
      * @interface
      */
    @js.native
    trait ReportOptions extends StObject {
      
      /**
        * true to flatten the report object down to a single level by concatenating nested key names; false to keep the default hierarchical format.
        * @type {boolean}
        */
      var flatten: js.UndefOr[Boolean] = js.native
      
      /**
        * If flatten is true, this string will be used to separate key names when they are concatenated together.
        * @type {boolean}
        */
      var separator: js.UndefOr[String] = js.native
    }
    object ReportOptions {
      
      @scala.inline
      def apply(): ReportOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportOptions]
      }
      
      @scala.inline
      implicit class ReportOptionsMutableBuilder[Self <: ReportOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      }
    }
  }
}
