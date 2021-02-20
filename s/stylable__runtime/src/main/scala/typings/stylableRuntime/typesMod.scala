package typings.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait AttributeMap
    extends /* attributeName */ StringDictionary[js.UndefOr[StateValue]] {
    
    var className: js.UndefOr[String] = js.native
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
  
  @js.native
  trait InheritedAttributes
    extends /* props */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
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
  
  @js.native
  trait RenderableStylesheet extends StObject {
    
    @JSName("$css")
    var $css: js.UndefOr[String] = js.native
    
    @JSName("$depth")
    var $depth: Double = js.native
    
    @JSName("$id")
    var $id: String | Double = js.native
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
  
  @js.native
  trait RuntimeStylesheet
    extends StylableExports
       with RenderableStylesheet {
    
    def cssStates(stateMap: StateMap): String = js.native
    
    var namespace: String = js.native
    
    def st(context: String, stateOrClass: js.UndefOr[scala.Nothing], classes: js.UndefOr[String]*): String = js.native
    def st(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
    def st(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
    @JSName("st")
    var st_Original: STFunction = js.native
    
    def style(context: String, stateOrClass: js.UndefOr[scala.Nothing], classes: js.UndefOr[String]*): String = js.native
    def style(context: String, stateOrClass: String, classes: js.UndefOr[String]*): String = js.native
    def style(context: String, stateOrClass: StateMap, classes: js.UndefOr[String]*): String = js.native
    @JSName("style")
    var style_Original: STFunction = js.native
  }
  
  type STFunction = js.Function3[
    /* context */ String, 
    /* stateOrClass */ js.UndefOr[String | StateMap], 
    /* repeated */ js.UndefOr[String], 
    String
  ]
  
  type StateMap = StringDictionary[StateValue]
  
  type StateValue = Boolean | Double | String
  
  @js.native
  trait StylableExports extends StObject {
    
    var classes: Record[String, String] = js.native
    
    var keyframes: Record[String, String] = js.native
    
    var stVars: Record[String, String] = js.native
    
    var vars: Record[String, String] = js.native
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
