package typings.vitalsigns

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.std.Record
import typings.vitalsigns.mod.vitalsigns.ConstraintWrapper
import typings.vitalsigns.mod.vitalsigns.Monitor
import typings.vitalsigns.mod.vitalsigns.MonitorField
import typings.vitalsigns.mod.vitalsigns.Options
import typings.vitalsigns.mod.vitalsigns.ReportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  open class ^ ()
    extends StObject
       with VitalSigns_ {
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
    def express(req: Request, res: Response): Any = js.native
    def express(req: Request, res: Response, next: NextFunction): Any = js.native
    /**
      * Gets a request handler.
      * @type {RequestHandler}
      */
    @JSName("express")
    var express_Original: RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
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
    
    trait Constraint extends StObject {
      
      /**
        * The comparator to use when comparing the field's value with the constraint value.
        * Valid comparators are: 'equal', 'greater', and 'less'.
        * @type {string}
        */
      var comparator: String
      
      /**
        * The name of the field to be constrained.
        * @type {string}
        */
      var field: String
      
      /**
        * The name of the monitor containing the field to be constrained.
        * @type {string}
        */
      var monitor: String
      
      /**
        * true to negate the outcome of the comparison; false or omitted to use the comparison result.
        * @type {boolean}
        */
      var negate: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The value against which the field should be compared.
        * @type {any}
        */
      var value: Any
    }
    object Constraint {
      
      inline def apply(comparator: String, field: String, monitor: String, value: Any): Constraint = {
        val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Constraint]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
        
        inline def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setMonitor(value: String): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
        
        inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
        
        inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait ConstraintWrapper extends StObject {
      
      @JSName("equals")
      var equals_FConstraintWrapper: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.undefined
      
      var greaterThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.undefined
      
      var lessThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.undefined
      
      var not: js.UndefOr[ConstraintWrapper] = js.undefined
    }
    object ConstraintWrapper {
      
      inline def apply(): ConstraintWrapper = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConstraintWrapper]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConstraintWrapper] (val x: Self) extends AnyVal {
        
        inline def setEquals_(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
        
        inline def setGreaterThan(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "greaterThan", js.Any.fromFunction1(value))
        
        inline def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
        
        inline def setLessThan(value: /* num */ Double => ConstraintWrapper): Self = StObject.set(x, "lessThan", js.Any.fromFunction1(value))
        
        inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
        
        inline def setNot(value: ConstraintWrapper): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      }
    }
    
    trait Monitor extends StObject {
      
      /**
        * Connections.
        * @type {any}
        */
      var connections: Any
    }
    object Monitor {
      
      inline def apply(connections: Any): Monitor = {
        val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
        __obj.asInstanceOf[Monitor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Monitor] (val x: Self) extends AnyVal {
        
        inline def setConnections(value: Any): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      }
    }
    
    trait MonitorField extends StObject {
      
      /**
        * Name.
        * @type {string}
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Units.
        * @type {string}
        */
      var units: js.UndefOr[String] = js.undefined
    }
    object MonitorField {
      
      inline def apply(): MonitorField = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MonitorField]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MonitorField] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
        
        inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /**
        * Number of milliseconds to wait between automatic health checks.
        * @type {number|boolean}
        */
      var autoCheck: js.UndefOr[Double | Boolean] = js.undefined
      
      /**
        * HTTP response code to send back in the VitalSigns.
        * @type {number}
        */
      var httpHealthy: js.UndefOr[Double] = js.undefined
      
      /**
        * HTTP response code to send back in the VitalSigns.
        * @type {number}
        */
      var httpUnhealthy: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAutoCheck(value: Double | Boolean): Self = StObject.set(x, "autoCheck", value.asInstanceOf[js.Any])
        
        inline def setAutoCheckUndefined: Self = StObject.set(x, "autoCheck", js.undefined)
        
        inline def setHttpHealthy(value: Double): Self = StObject.set(x, "httpHealthy", value.asInstanceOf[js.Any])
        
        inline def setHttpHealthyUndefined: Self = StObject.set(x, "httpHealthy", js.undefined)
        
        inline def setHttpUnhealthy(value: Double): Self = StObject.set(x, "httpUnhealthy", value.asInstanceOf[js.Any])
        
        inline def setHttpUnhealthyUndefined: Self = StObject.set(x, "httpUnhealthy", js.undefined)
      }
    }
    
    /**
      * Report options.
      * @interface
      */
    trait ReportOptions extends StObject {
      
      /**
        * true to flatten the report object down to a single level by concatenating nested key names; false to keep the default hierarchical format.
        * @type {boolean}
        */
      var flatten: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If flatten is true, this string will be used to separate key names when they are concatenated together.
        * @type {boolean}
        */
      var separator: js.UndefOr[String] = js.undefined
    }
    object ReportOptions {
      
      inline def apply(): ReportOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ReportOptions] (val x: Self) extends AnyVal {
        
        inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
        
        inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      }
    }
  }
}
