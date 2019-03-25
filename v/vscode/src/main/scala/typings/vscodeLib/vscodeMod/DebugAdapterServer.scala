package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DebugAdapterServer")
@js.native
class DebugAdapterServer protected () extends DebugAdapterDescriptor {
  /**
  		 * Create a description for a debug adapter running as a socket based server.
  		 */
  def this(port: scala.Double) = this()
  def this(port: scala.Double, host: java.lang.String) = this()
  /**
  		 * The host.
  		 */
  val host: js.UndefOr[java.lang.String] = js.native
  /**
  		 * The port.
  		 */
  val port: scala.Double = js.native
}

