package typings.vfileFindUp

import typings.vfileFindUp.vfileFindUpNumbers.`1`
import typings.vfileFindUp.vfileFindUpNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-find-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vfile-find-up", "BREAK")
  @js.native
  val BREAK: `4` = js.native
  
  @JSImport("vfile-find-up", "INCLUDE")
  @js.native
  val INCLUDE: `1` = js.native
  
  inline def findUp(test: Test): js.Promise[js.Array[VFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(test.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[VFile]]]
  inline def findUp(test: Test, callback: js.Function2[/* error */ js.Error | Null, /* files */ js.Array[VFile], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findUp(test: Test, cwd: String): js.Promise[js.Array[VFile]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(test.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[VFile]]]
  inline def findUp(
    test: Test,
    cwd: String,
    callback: js.Function2[/* error */ js.Error | Null, /* files */ js.Array[VFile], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(test.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findUpOne(test: Test): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUpOne")(test.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def findUpOne(
    test: Test,
    callback: js.Function2[/* error */ js.Error | Null, /* file */ js.UndefOr[VFile], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpOne")(test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findUpOne(test: Test, cwd: String): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpOne")(test.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def findUpOne(
    test: Test,
    cwd: String,
    callback: js.Function2[/* error */ js.Error | Null, /* file */ js.UndefOr[VFile], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findUpOne")(test.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Assert = js.Function1[/* file */ VFile, Double | Boolean | Unit]
  
  type Test = String | Assert | (js.Array[String | Assert])
  
  type VFile = typings.vfile.mod.VFile
}
