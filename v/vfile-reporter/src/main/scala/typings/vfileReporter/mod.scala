package typings.vfileReporter

import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-reporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(files: js.Array[VFile]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(files: js.Array[VFile], options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(files: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(files: js.Error, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(files: Unit, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(files: VFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(files: VFile, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def reporter(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")().asInstanceOf[String]
  inline def reporter(files: js.Array[VFile]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: js.Array[VFile], options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: js.Error, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: Unit, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: VFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: VFile, options: typings.vfileReporter.libMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Options = typings.vfileReporter.libMod.Options
}
