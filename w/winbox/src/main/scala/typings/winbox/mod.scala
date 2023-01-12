package typings.winbox

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.winbox.winboxStrings.bottom
import typings.winbox.winboxStrings.center
import typings.winbox.winboxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined winbox.winbox.WinBoxConstructor & {  new :(title : string, params : winbox.winbox.Params | undefined): winbox.winbox.WinBox | (params : winbox.winbox.Params): winbox.winbox.WinBox} */
object mod {
  
  inline def apply(params: Params): WinBox = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[WinBox]
  inline def apply(title: String): WinBox = ^.asInstanceOf[js.Dynamic].apply(title.asInstanceOf[js.Any]).asInstanceOf[WinBox]
  inline def apply(title: String, params: Params): WinBox = (^.asInstanceOf[js.Dynamic].apply(title.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[WinBox]
  
  @JSImport("winbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("winbox", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with WinBox {
    def this(params: Params) = this()
    def this(title: String) = this()
    def this(title: String, params: Params) = this()
  }
  
  @JSImport("winbox", "new")
  @js.native
  val `new`: (js.Function2[/* title */ String, /* params */ js.UndefOr[Params], WinBox]) | (js.Function1[/* params */ Params, WinBox]) = js.native
  
  trait Params extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[HTMLElement] = js.undefined
    
    var border: js.UndefOr[String | Double] = js.undefined
    
    var bottom: js.UndefOr[String | Double] = js.undefined
    
    var `class`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[String | Double] = js.undefined
    
    var max: js.UndefOr[Boolean] = js.undefined
    
    var minheight: js.UndefOr[String | Double] = js.undefined
    
    var minwidth: js.UndefOr[String | Double] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var mount: js.UndefOr[Node] = js.undefined
    
    var onblur: js.UndefOr[js.ThisFunction0[/* this */ WinBox, Unit]] = js.undefined
    
    var onclose: js.UndefOr[js.ThisFunction1[/* this */ WinBox, /* force */ js.UndefOr[Boolean], Boolean]] = js.undefined
    
    var onfocus: js.UndefOr[js.ThisFunction0[/* this */ WinBox, Unit]] = js.undefined
    
    var onmove: js.UndefOr[js.ThisFunction2[/* this */ WinBox, /* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    var onresize: js.UndefOr[
        js.ThisFunction2[/* this */ WinBox, /* width */ Double, /* height */ Double, Unit]
      ] = js.undefined
    
    var right: js.UndefOr[String | Double] = js.undefined
    
    var root: js.UndefOr[Node] = js.undefined
    
    var splitscreen: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String | Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var x: js.UndefOr[right | center | String | Double] = js.undefined
    
    var y: js.UndefOr[bottom | center | String | Double] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBody(value: HTMLElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBorder(value: String | Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setClass(value: String | js.Array[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClassVarargs(value: String*): Self = StObject.set(x, "class", js.Array(value*))
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMinheight(value: String | Double): Self = StObject.set(x, "minheight", value.asInstanceOf[js.Any])
      
      inline def setMinheightUndefined: Self = StObject.set(x, "minheight", js.undefined)
      
      inline def setMinwidth(value: String | Double): Self = StObject.set(x, "minwidth", value.asInstanceOf[js.Any])
      
      inline def setMinwidthUndefined: Self = StObject.set(x, "minwidth", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setMount(value: Node): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction0[/* this */ WinBox, Unit]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOnclose(value: js.ThisFunction1[/* this */ WinBox, /* force */ js.UndefOr[Boolean], Boolean]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOnfocus(value: js.ThisFunction0[/* this */ WinBox, Unit]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOnmove(value: js.ThisFunction2[/* this */ WinBox, /* x */ Double, /* y */ Double, Unit]): Self = StObject.set(x, "onmove", value.asInstanceOf[js.Any])
      
      inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
      
      inline def setOnresize(value: js.ThisFunction2[/* this */ WinBox, /* width */ Double, /* height */ Double, Unit]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSplitscreen(value: Boolean): Self = StObject.set(x, "splitscreen", value.asInstanceOf[js.Any])
      
      inline def setSplitscreenUndefined: Self = StObject.set(x, "splitscreen", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: right | center | String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: bottom | center | String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait WinBox extends StObject {
    
    def addClass(classname: String): WinBox = js.native
    
    var background: String = js.native
    
    var body: HTMLElement = js.native
    
    var border: String | Double = js.native
    
    var `class`: String | js.Array[String] = js.native
    
    def close(): Boolean | Unit = js.native
    def close(force: Boolean): Boolean | Unit = js.native
    
    var dom: Node = js.native
    
    def focus(): WinBox = js.native
    
    def fullscreen(): WinBox = js.native
    def fullscreen(state: Boolean): WinBox = js.native
    
    def hide(): WinBox = js.native
    
    var html: String = js.native
    
    var id: String | Double = js.native
    
    var index: Double = js.native
    
    var max: Boolean = js.native
    
    def maximize(): WinBox = js.native
    def maximize(state: Boolean): WinBox = js.native
    
    def minimize(): WinBox = js.native
    def minimize(state: Boolean): WinBox = js.native
    
    var modal: Boolean = js.native
    
    def mount(): WinBox = js.native
    def mount(src: Element): WinBox = js.native
    
    def move(): WinBox = js.native
    def move(x: String): WinBox = js.native
    def move(x: String, y: String): WinBox = js.native
    def move(x: String, y: String, skipUpdate: Boolean): WinBox = js.native
    def move(x: String, y: Double): WinBox = js.native
    def move(x: String, y: Double, skipUpdate: Boolean): WinBox = js.native
    def move(x: String, y: Unit, skipUpdate: Boolean): WinBox = js.native
    def move(x: Double): WinBox = js.native
    def move(x: Double, y: String): WinBox = js.native
    def move(x: Double, y: String, skipUpdate: Boolean): WinBox = js.native
    def move(x: Double, y: Double): WinBox = js.native
    def move(x: Double, y: Double, skipUpdate: Boolean): WinBox = js.native
    def move(x: Double, y: Unit, skipUpdate: Boolean): WinBox = js.native
    def move(x: Unit, y: String): WinBox = js.native
    def move(x: Unit, y: String, skipUpdate: Boolean): WinBox = js.native
    def move(x: Unit, y: Double): WinBox = js.native
    def move(x: Unit, y: Double, skipUpdate: Boolean): WinBox = js.native
    def move(x: Unit, y: Unit, skipUpdate: Boolean): WinBox = js.native
    
    def onblur(): Unit = js.native
    
    def onclose(force: Boolean): Boolean = js.native
    
    def onfocus(): Unit = js.native
    
    def onmove(x: Double, y: Double): Unit = js.native
    
    def onresize(width: Double, height: Double): Unit = js.native
    
    def removeClass(classname: String): WinBox = js.native
    
    def resize(): WinBox = js.native
    def resize(w: String): WinBox = js.native
    def resize(w: String, h: String): WinBox = js.native
    def resize(w: String, h: String, skipUpdate: Boolean): WinBox = js.native
    def resize(w: String, h: Double): WinBox = js.native
    def resize(w: String, h: Double, skipUpdate: Boolean): WinBox = js.native
    def resize(w: String, h: Unit, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Double): WinBox = js.native
    def resize(w: Double, h: String): WinBox = js.native
    def resize(w: Double, h: String, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Double, h: Double): WinBox = js.native
    def resize(w: Double, h: Double, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Double, h: Unit, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Unit, h: String): WinBox = js.native
    def resize(w: Unit, h: String, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Unit, h: Double): WinBox = js.native
    def resize(w: Unit, h: Double, skipUpdate: Boolean): WinBox = js.native
    def resize(w: Unit, h: Unit, skipUpdate: Boolean): WinBox = js.native
    
    var root: Node = js.native
    
    def setBackground(background: String): WinBox = js.native
    
    def setTitle(title: String): WinBox = js.native
    
    def setUrl(url: String): WinBox = js.native
    
    def show(): WinBox = js.native
    
    var title: String = js.native
    
    def unmount(): WinBox = js.native
    def unmount(dest: Element): WinBox = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait WinBoxConstructor
    extends StObject
       with Instantiable1[(/* params */ Params) | (/* title */ String), WinBox]
       with Instantiable2[/* title */ String, /* params */ Params, WinBox] {
    
    def apply(params: Params): WinBox = js.native
    def apply(title: String): WinBox = js.native
    def apply(title: String, params: Params): WinBox = js.native
  }
}
