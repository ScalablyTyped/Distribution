package typings.styleMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.DocumentOrShadowRoot
import typings.std.ShadowRoot
import typings.styleMod.anon.Finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-mod", "StyleModule")
  @js.native
  open class StyleModule protected () extends StObject {
    def this(spec: StringDictionary[StyleSpec]) = this()
    def this(spec: StringDictionary[StyleSpec], options: Finish) = this()
    
    def getRules(): String = js.native
  }
  /* static members */
  object StyleModule {
    
    @JSImport("style-mod", "StyleModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mount(root: DocumentOrShadowRoot, module: js.Array[StyleModule]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mount(root: DocumentOrShadowRoot, module: StyleModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mount(root: Document, module: js.Array[StyleModule]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mount(root: Document, module: StyleModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mount(root: ShadowRoot, module: js.Array[StyleModule]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mount(root: ShadowRoot, module: StyleModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(root.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def newName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newName")().asInstanceOf[String]
  }
  
  trait StyleSpec
    extends StObject
       with /* propOrSelector */ StringDictionary[String | Double | StyleSpec | Null]
  object StyleSpec {
    
    inline def apply(): StyleSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleSpec]
    }
  }
}
