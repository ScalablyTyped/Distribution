package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RemoteConsole extends Remote {
  /**
       * Show an error message.
       *
       * @param message The message to show.
       */
  def error(message: java.lang.String): scala.Unit
  /**
       * Show an information message.
       *
       * @param message The message to show.
       */
  def info(message: java.lang.String): scala.Unit
  /**
       * Log a message.
       *
       * @param message The message to log.
       */
  def log(message: java.lang.String): scala.Unit
  /**
       * Show a warning message.
       *
       * @param message The message to show.
       */
  def warn(message: java.lang.String): scala.Unit
}

