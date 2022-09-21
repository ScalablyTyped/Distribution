package typings.windowsElevate

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecFileException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-elevate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(cmd: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def exec(cmd: String, options: String): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    cmd: String,
    options: String,
    callback: js.Function3[/* error */ ExecFileException, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(cmd: String, options: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    cmd: String,
    options: js.Array[String],
    callback: js.Function3[/* error */ ExecFileException, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    cmd: String,
    options: Null,
    callback: js.Function3[/* error */ ExecFileException, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def exec(
    cmd: String,
    options: Unit,
    callback: js.Function3[/* error */ ExecFileException, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
}
