package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ChildrenAny
import typings.wixStyleReact.anon.IsDragActive
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropzoneDropzoneMod {
  
  /** Defines a region in the page where files can be dropped */
  @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", JSImport.Default)
  @js.native
  open class default protected () extends Dropzone {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object Content {
      
      inline def apply(param0: ChildrenAny): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.Content")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.Content.displayName_1")
      @js.native
      val displayName1: String = js.native
    }
    
    object Overlay {
      
      inline def apply(param0: ChildrenAny): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.Overlay")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.Overlay.displayName")
      @js.native
      val displayName: String = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default._overrideEventDefaults")
    @js.native
    def overrideEventDefaults: js.Function1[/* event */ Any, Unit] = js.native
    
    inline def overrideEventDefaults_=(x: js.Function1[/* event */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_overrideEventDefaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Accepts `<Dropzone.Overlay />` or `<Dropzone.Content />`. Both of them can contain any required content. */
      inline def children(props: Any, propName: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("children")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      /** Specifies a CSS class name to be appended to the component’s root element. */
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Defines an event handler which is called when files are dropped over the dropzone. Dropped files are supplied as an argument to the function. */
      @JSImport("wix-style-react/dist/types/Dropzone/Dropzone", "default.propTypes.onDrop")
      @js.native
      def onDrop: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onDrop_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Defines a region in the page where files can be dropped */
  @js.native
  trait Dropzone extends PureComponent[Any, Any, Any] {
    
    /** https://spin.atomicobject.com/2018/09/13/file-uploader-react-typescript/ */
    var _dragEventCounter: Double = js.native
    
    def _eventHasFiles(event: Any): Boolean = js.native
    
    def _onDragEnter(event: Any): `false` | Unit = js.native
    
    def _onDragLeave(event: Any): `false` | Unit = js.native
    
    def _onDrop(event: Any): Any = js.native
    
    @JSName("state")
    var state_Dropzone: IsDragActive = js.native
  }
}
