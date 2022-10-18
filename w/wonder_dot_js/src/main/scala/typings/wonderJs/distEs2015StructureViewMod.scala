package typings.wonderJs

import typings.std.WebGLRenderingContext
import typings.wonderJs.anon.X
import typings.wonderJs.anon.Y
import typings.wonderJs.distEs2015CoreDataMainDataMod.ContextConfigData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StructureViewMod {
  
  @JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
  @js.native
  open class ViewWebGL protected ()
    extends StObject
       with IView {
    def this(dom: Any) = this()
    
    /* CompleteClass */
    var dom: Any = js.native
    
    /* CompleteClass */
    override def getContext(contextConfig: ContextConfigData): WebGLRenderingContext = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    override def initCanvas(): Unit = js.native
    
    /* CompleteClass */
    var offset: Y = js.native
    @JSName("offset")
    val offset_ViewWebGL: X = js.native
    
    /* CompleteClass */
    var styleHeight: String = js.native
    
    /* CompleteClass */
    var styleWidth: String = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  /* static members */
  object ViewWebGL {
    
    @JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(view: Any): ViewWebGL = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(view.asInstanceOf[js.Any]).asInstanceOf[ViewWebGL]
  }
  
  trait IView extends StObject {
    
    var dom: Any
    
    def getContext(contextConfig: ContextConfigData): WebGLRenderingContext
    
    var height: Double
    
    def initCanvas(): Unit
    
    var offset: Y
    
    var styleHeight: String
    
    var styleWidth: String
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object IView {
    
    inline def apply(
      dom: Any,
      getContext: ContextConfigData => WebGLRenderingContext,
      height: Double,
      initCanvas: () => Unit,
      offset: Y,
      styleHeight: String,
      styleWidth: String,
      width: Double,
      x: Double,
      y: Double
    ): IView = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], initCanvas = js.Any.fromFunction0(initCanvas), offset = offset.asInstanceOf[js.Any], styleHeight = styleHeight.asInstanceOf[js.Any], styleWidth = styleWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setDom(value: Any): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setGetContext(value: ContextConfigData => WebGLRenderingContext): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInitCanvas(value: () => Unit): Self = StObject.set(x, "initCanvas", js.Any.fromFunction0(value))
      
      inline def setOffset(value: Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStyleHeight(value: String): Self = StObject.set(x, "styleHeight", value.asInstanceOf[js.Any])
      
      inline def setStyleWidth(value: String): Self = StObject.set(x, "styleWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
