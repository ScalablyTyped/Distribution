package typings.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AttributeMap
    extends StObject
       with /* attributeName */ StringDictionary[js.UndefOr[StateValue]] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object AttributeMap {
    
    @scala.inline
    def apply(): AttributeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeMap]
    }
    
    @scala.inline
    implicit class AttributeMapMutableBuilder[Self <: AttributeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait InheritedAttributes
    extends StObject
       with /* props */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object InheritedAttributes {
    
    @scala.inline
    def apply(): InheritedAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InheritedAttributes]
    }
    
    @scala.inline
    implicit class InheritedAttributesMutableBuilder[Self <: InheritedAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait NodeRenderer[I, O /* <: Element */] extends StObject {
    
    def create(stylesheet: I, key: String): O = js.native
    def create(stylesheet: I, key: Double): O = js.native
    
    def hasKey(node: O): Boolean = js.native
    
    def renderKey(stylesheet: I): String | Double = js.native
    
    def update(stylesheet: I, node: O): O = js.native
  }
  
  trait RenderableStylesheet extends StObject {
    
    @JSName("$css")
    var $css: js.UndefOr[String] = js.undefined
    
    @JSName("$depth")
    var $depth: Double
    
    @JSName("$id")
    var $id: String | Double
  }
  object RenderableStylesheet {
    
    @scala.inline
    def apply($depth: Double, $id: String | Double): RenderableStylesheet = {
      val __obj = js.Dynamic.literal($depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderableStylesheet]
    }
    
    @scala.inline
    implicit class RenderableStylesheetMutableBuilder[Self <: RenderableStylesheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$css(value: String): Self = StObject.set(x, "$css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$cssUndefined: Self = StObject.set(x, "$css", js.undefined)
      
      @scala.inline
      def set$depth(value: Double): Self = StObject.set(x, "$depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$id(value: String | Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuntimeStylesheet
    extends StObject
       with StylableExports
       with RenderableStylesheet {
    
    def cssStates(stateMap: StateMap): String
    
    var namespace: String
    
    def st(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def st(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def st(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    @JSName("st")
    var st_Original: STFunction
    
    def style(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String
    def style(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String
    def style(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String
    @JSName("style")
    var style_Original: STFunction
  }
  object RuntimeStylesheet {
    
    @scala.inline
    def apply(
      $depth: Double,
      $id: String | Double,
      classes: Record[String, String],
      cssStates: StateMap => String,
      keyframes: Record[String, String],
      namespace: String,
      st: STFunction,
      stVars: Record[String, String],
      style: STFunction,
      vars: Record[String, String]
    ): RuntimeStylesheet = {
      val __obj = js.Dynamic.literal($depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], cssStates = js.Any.fromFunction1(cssStates), keyframes = keyframes.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeStylesheet]
    }
    
    @scala.inline
    implicit class RuntimeStylesheetMutableBuilder[Self <: RuntimeStylesheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssStates(value: StateMap => String): Self = StObject.set(x, "cssStates", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSt(value: STFunction): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: STFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait STFunction extends StObject {
    
    def apply(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
    def apply(context: String, stateOrClass: Unit, classes: js.UndefOr[String]*): String = js.native
    def apply(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
  }
  
  type StateMap = StringDictionary[StateValue]
  
  type StateValue = Boolean | Double | String
  
  trait StylableExports extends StObject {
    
    var classes: Record[String, String]
    
    var keyframes: Record[String, String]
    
    var stVars: Record[String, String]
    
    var vars: Record[String, String]
  }
  object StylableExports {
    
    @scala.inline
    def apply(
      classes: Record[String, String],
      keyframes: Record[String, String],
      stVars: Record[String, String],
      vars: Record[String, String]
    ): StylableExports = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], stVars = stVars.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableExports]
    }
    
    @scala.inline
    implicit class StylableExportsMutableBuilder[Self <: StylableExports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Record[String, String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframes(value: Record[String, String]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStVars(value: Record[String, String]): Self = StObject.set(x, "stVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVars(value: Record[String, String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    }
  }
}
