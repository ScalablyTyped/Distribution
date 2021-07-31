package typings.stylis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("stylis", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Stylis {
    def this(options: Options) = this()
  }
  @JSImport("stylis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Stylis = js.native
  
  @js.native
  sealed trait Context extends StObject
  @JSImport("stylis", "Context")
  @js.native
  object Context extends StObject {
    
    @js.native
    sealed trait ATRUL
      extends StObject
         with Context
    
    @js.native
    sealed trait BLCKS
      extends StObject
         with Context
    
    @js.native
    sealed trait POSTS
      extends StObject
         with Context
    
    @js.native
    sealed trait PREPS
      extends StObject
         with Context
    
    @js.native
    sealed trait PROPS
      extends StObject
         with Context
    
    @js.native
    sealed trait UNKWN
      extends StObject
         with Context
  }
  
  object global {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("stylis")
    @js.native
    class stylis ()
      extends StObject
         with Stylis {
      def this(options: Options) = this()
    }
    @JSGlobal("stylis")
    @js.native
    val stylis: Stylis = js.native
  }
  
  trait Options extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var keyframe: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[
        Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
      ] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var semicolon: js.UndefOr[Boolean] = js.undefined
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
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setKeyframe(value: Boolean): Self = StObject.set(x, "keyframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframeUndefined: Self = StObject.set(x, "keyframe", js.undefined)
      
      @scala.inline
      def setPrefix(
        value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ Double) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setSemicolon(value: Boolean): Self = StObject.set(x, "semicolon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonUndefined: Self = StObject.set(x, "semicolon", js.undefined)
    }
  }
  
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ String, 
    /* selector */ Selectors, 
    /* parent */ Selectors, 
    /* line */ Double, 
    /* column */ Double, 
    /* length */ Double, 
    /* at */ Double, 
    /* depth */ Double, 
    js.Any
  ]
  
  type Selectors = js.Array[String]
  
  @js.native
  trait Set extends StObject {
    
    def apply(): Set = js.native
    def apply(options: Options): Set = js.native
  }
  
  @js.native
  trait Stylis
    extends StObject
       with Instantiable0[Stylis]
       with Instantiable1[/* options */ Options, Stylis] {
    
    def apply(namescope: String, input: String): String | js.Any = js.native
    
    def set(): Set = js.native
    def set(options: Options): Set = js.native
    @JSName("set")
    var set_Original: Set = js.native
    
    def use(): Use = js.native
    def use(plugin: js.Array[Plugin]): Use = js.native
    def use(plugin: Plugin): Use = js.native
    @JSName("use")
    var use_Original: Use = js.native
  }
  
  @js.native
  trait Use extends StObject {
    
    def apply(): Use = js.native
    def apply(plugin: js.Array[Plugin]): Use = js.native
    def apply(plugin: Plugin): Use = js.native
  }
  
  type _To = js.Object & Stylis
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Stylis = ^
}
