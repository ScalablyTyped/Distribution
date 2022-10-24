package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropzoneMod {
  
  @JSImport("wix-style-react/dist/types/Dropzone", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[DropzoneProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Dropzone", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Dropzone", "default.Content")
    @js.native
    def Content: FC[js.Object] = js.native
    inline def Content_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Dropzone", "default.Overlay")
    @js.native
    def Overlay: FC[js.Object] = js.native
    inline def Overlay_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(x.asInstanceOf[js.Any])
  }
  
  type Dropzone = PureComponent[DropzoneProps, js.Object, Any]
  
  trait DropzoneProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    def onDrop(files: js.Array[File]): Unit
  }
  object DropzoneProps {
    
    inline def apply(onDrop: js.Array[File] => Unit): DropzoneProps = {
      val __obj = js.Dynamic.literal(onDrop = js.Any.fromFunction1(onDrop))
      __obj.asInstanceOf[DropzoneProps]
    }
    
    extension [Self <: DropzoneProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnDrop(value: js.Array[File] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    }
  }
}
