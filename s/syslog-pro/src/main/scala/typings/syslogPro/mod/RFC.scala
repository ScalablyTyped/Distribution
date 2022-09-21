package typings.syslogPro.mod

import typings.syslogPro.syslogProBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RFC extends StObject {
  
  /**
    * Send a Syslog message with a severity level of 1 (Alert).
    *
    * @param msg The alert message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def alert(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 2 (Critical).
    *
    * @param msg The critical message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def crit(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 2 (Critical).
    *
    * @param msg The critical message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def critical(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 7 (Debug).
    *
    * @param msg The debug message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def debug(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 0 (Emergency).
    *
    * @param msg The emergency message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def emer(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 0 (Emergency).
    *
    * @param msg The emergency message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def emergency(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 3 (Error).
    *
    * @param msg The error message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def err(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 3 (Error).
    *
    * @param msg The error message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def error(msg: String): js.Promise[String] = js.native
  
  val extendedColor: Boolean = js.native
  
  /**
    * Send a Syslog message with a severity level of 6 (Informational).
    *
    * @param msg The informational message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def info(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 6 (Informational).
    *
    * @param msg The informational message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def informational(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 6 (Informational).
    *
    * @param msg The informational message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def log(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 5 (Notice).
    *
    * @param msg The notice message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def note(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 5 (Notice).
    *
    * @param msg The notice message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def notice(msg: String): js.Promise[String] = js.native
  
  /**
    * Sets the color to be used for messages at a set priority.
    *
    * @throws A standard error object.
    */
  def setColor(colors: Colors): `true` = js.native
  def setColor(colors: Colors, extendedColor: Boolean): `true` = js.native
  
  /**
    * Send a Syslog message with a severity level of 4 (Warning).
    *
    * @param msg The warning message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def warn(msg: String): js.Promise[String] = js.native
  
  /**
    * Send a Syslog message with a severity level of 4 (Warning).
    *
    * @param msg The warning message to send to the Syslog server.
    * @returns The formatted syslog message sent to the Syslog server.
    * @throws Any bubbled-up error.
    */
  def warning(msg: String): js.Promise[String] = js.native
}
