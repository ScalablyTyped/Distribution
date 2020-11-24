package typings.sudoPrompt

import typings.node.Buffer
import typings.std.Error
import typings.sudoPrompt.anon.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sudo-prompt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def exec(cmd: String): Unit = js.native
  def exec(
    cmd: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ js.UndefOr[Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = js.native
  def exec(
    cmd: String,
    options: js.Function3[
      /* error */ js.UndefOr[Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = js.native
  def exec(
    cmd: String,
    options: js.Function3[
      /* error */ js.UndefOr[Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ],
    callback: js.Function3[
      /* error */ js.UndefOr[Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = js.native
  def exec(cmd: String, options: Env): Unit = js.native
  def exec(
    cmd: String,
    options: Env,
    callback: js.Function3[
      /* error */ js.UndefOr[Error], 
      /* stdout */ js.UndefOr[String | Buffer], 
      /* stderr */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = js.native
}
