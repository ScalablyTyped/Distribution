package typings.unifiedMessageControl

import typings.std.Record
import typings.unifiedMessageControl.unifiedMessageControlBooleans.`false`
import typings.unifiedMessageControl.unifiedMessageControlBooleans.`true`
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistUtilIs.mod.Props
import typings.unistUtilIs.mod.TestFunctionAnything
import typings.unistUtilIs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unified-message-control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): js.Function2[/* tree */ Node, /* file */ VFile, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* tree */ Node, /* file */ VFile, Unit]]
  
  trait Mark extends StObject {
    
    var point: js.UndefOr[Point] = js.undefined
    
    var state: Boolean
  }
  object Mark {
    
    inline def apply(state: Boolean): Mark = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Marker extends StObject {
    
    /**
      * Value after name.
      */
    var attributes: String
    
    /**
      * Name of marker.
      */
    var name: String
    
    /**
      * Reference to given node.
      */
    var node: Node
    
    /**
      * Parsed attributes.
      */
    var parameters: Record[String, String | Double | Boolean]
  }
  object Marker {
    
    inline def apply(
      attributes: String,
      name: String,
      node: Node,
      parameters: Record[String, String | Double | Boolean]
    ): Marker = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkerParser = js.Function1[/* node */ Node, Any]
  
  type Node = typings.unist.mod.Node[Data]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unifiedMessageControl.mod.OptionsWithoutReset
    - typings.unifiedMessageControl.mod.OptionsWithReset
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithReset(marker: /* node */ Node => Any, name: String): typings.unifiedMessageControl.mod.OptionsWithReset = {
      val __obj = js.Dynamic.literal(marker = js.Any.fromFunction1(marker), name = name.asInstanceOf[js.Any], reset = true)
      __obj.asInstanceOf[typings.unifiedMessageControl.mod.OptionsWithReset]
    }
    
    inline def OptionsWithoutReset(marker: /* node */ Node => Any, name: String): typings.unifiedMessageControl.mod.OptionsWithoutReset = {
      val __obj = js.Dynamic.literal(marker = js.Any.fromFunction1(marker), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.unifiedMessageControl.mod.OptionsWithoutReset]
    }
  }
  
  trait OptionsBaseFields extends StObject {
    
    /**
      * List of allowed `ruleId`s. When given a warning is shown
      * when someone tries to control an unknown rule.
      *
      * For example, `{name: 'alpha', known: ['bravo']}` results in a warning if
      * `charlie` is configured:
      *
      * ```html
      * <!--alpha ignore charlie-->
      * ```
      */
    var known: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Parse a possible marker to a comment marker object (Marker).
      * If the marker isn't a marker, should return `null`.
      */
    def marker(node: Node): Any
    /**
      * Parse a possible marker to a comment marker object (Marker).
      * If the marker isn't a marker, should return `null`.
      */
    @JSName("marker")
    var marker_Original: MarkerParser
    
    /**
      * Name of markers that can control the message sources.
      *
      * For example, `{name: 'alpha'}` controls `alpha` markers:
      *
      * ```html
      * <!--alpha ignore-->
      * ```
      */
    var name: String
    
    /**
      * Sources that can be controlled with `name` markers.
      * Defaults to `name`.
      */
    var source: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Test for possible markers
      */
    var test: js.UndefOr[Test] = js.undefined
  }
  object OptionsBaseFields {
    
    inline def apply(marker: /* node */ Node => Any, name: String): OptionsBaseFields = {
      val __obj = js.Dynamic.literal(marker = js.Any.fromFunction1(marker), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsBaseFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsBaseFields] (val x: Self) extends AnyVal {
      
      inline def setKnown(value: js.Array[String]): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
      
      inline def setKnownUndefined: Self = StObject.set(x, "known", js.undefined)
      
      inline def setKnownVarargs(value: String*): Self = StObject.set(x, "known", js.Array(value*))
      
      inline def setMarker(value: /* node */ Node => Any): Self = StObject.set(x, "marker", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction3(
        value: (/* node */ typings.unistUtilIs.mod.Node, /* index */ js.UndefOr[Double | Null], /* parent */ js.UndefOr[typings.unistUtilIs.mod.Parent | Null]) => Boolean | Unit
      ): Self = StObject.set(x, "test", js.Any.fromFunction3(value))
      
      inline def setTestNull: Self = StObject.set(x, "test", null)
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: (Type | Props | TestFunctionAnything)*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
  
  trait OptionsWithReset
    extends StObject
       with OptionsBaseFields
       with OptionsWithResetFields
       with Options
  object OptionsWithReset {
    
    inline def apply(marker: /* node */ Node => Any, name: String): OptionsWithReset = {
      val __obj = js.Dynamic.literal(marker = js.Any.fromFunction1(marker), name = name.asInstanceOf[js.Any], reset = true)
      __obj.asInstanceOf[OptionsWithReset]
    }
  }
  
  trait OptionsWithResetFields extends StObject {
    
    /**
      * List of `ruleId`s to initially turn on.
      */
    var enable: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to treat all messages as turned off initially.
      */
    var reset: `true`
  }
  object OptionsWithResetFields {
    
    inline def apply(): OptionsWithResetFields = {
      val __obj = js.Dynamic.literal(reset = true)
      __obj.asInstanceOf[OptionsWithResetFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithResetFields] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: js.Array[String]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEnableVarargs(value: String*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setReset(value: `true`): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsWithoutReset
    extends StObject
       with OptionsBaseFields
       with OptionsWithoutResetFields
       with Options
  object OptionsWithoutReset {
    
    inline def apply(marker: /* node */ Node => Any, name: String): OptionsWithoutReset = {
      val __obj = js.Dynamic.literal(marker = js.Any.fromFunction1(marker), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithoutReset]
    }
  }
  
  trait OptionsWithoutResetFields extends StObject {
    
    /**
      * List of `ruleId`s to turn off.
      */
    var disable: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to treat all messages as turned off initially.
      */
    var reset: js.UndefOr[`false`] = js.undefined
  }
  object OptionsWithoutResetFields {
    
    inline def apply(): OptionsWithoutResetFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithoutResetFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithoutResetFields] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: js.Array[String]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisableVarargs(value: String*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setReset(value: `false`): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    }
  }
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Point = typings.unist.mod.Point
  
  type Test = typings.unistUtilIs.mod.Test
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileMessage = typings.vfileMessage.mod.VFileMessage
}
