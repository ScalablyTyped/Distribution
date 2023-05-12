package typings.twilio.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("twilio/lib", "Twilio")
@js.native
/**
  * Creates a new instance of Twilio Client
  *
  * @param username -
  *          The username used for authentication. This is normally account sid, but if using key/secret auth will be the api key sid.
  * @param password -
  *          The password used for authentication. This is normally auth token, but if using key/secret auth will be the secret.
  * @param opts - The options argument
  *
  * @returns A new instance of Twilio client
  */
open class TwilioCls ()
  extends typings.twilio.libRestTwilioMod.^ {
  def this(username: String) = this()
  def this(username: String, password: String) = this()
  def this(username: Unit, password: String) = this()
  def this(username: String, password: String, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts) = this()
  def this(username: String, password: Unit, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts) = this()
  def this(username: Unit, password: String, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts) = this()
  def this(username: Unit, password: Unit, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts) = this()
}
