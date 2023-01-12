package typings.writePkg

import typings.typeFest.sourceBasicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writePackage(data: JsonObject): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("writePackage")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def writePackage(data: JsonObject, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackage")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writePackage(path: String, data: JsonObject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackage")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writePackage(path: String, data: JsonObject, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackage")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writePackageSync(data: JsonObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writePackageSync")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writePackageSync(data: JsonObject, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackageSync")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writePackageSync(path: String, data: JsonObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackageSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writePackageSync(path: String, data: JsonObject, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePackageSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    	The indentation to use for new files.
    	Accepts `'\t'` for tab indentation or a number of spaces.
    	If the file already exists, the existing indentation will be used.
    	Default: Auto-detected or `'\t'`
    	*/
    val indent: js.UndefOr[String | Double] = js.undefined
    
    /**
    	Remove empty `dependencies`, `devDependencies`, `optionalDependencies` and `peerDependencies` objects.
    	@default true
    	*/
    val normalize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIndent(value: String | Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
