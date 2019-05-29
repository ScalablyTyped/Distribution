package typings
package atXmppJidLib.atXmppJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", "JID")
@js.native
class JID protected () extends js.Object {
  def this(local: js.UndefOr[scala.Nothing], domain: java.lang.String) = this()
  def this(local: java.lang.String, domain: java.lang.String) = this()
  def this(local: js.UndefOr[scala.Nothing], domain: java.lang.String, resource: java.lang.String) = this()
  def this(local: java.lang.String, domain: java.lang.String, resource: java.lang.String) = this()
  var domain: java.lang.String = js.native
  var local: java.lang.String = js.native
  var resource: java.lang.String = js.native
  /**
    * Convenience method to distinguish users
    */
  def bare(): JID = js.native
  /**
    * Comparison function
    */
  def equals(other: JID): scala.Boolean = js.native
  def getDomain(): java.lang.String = js.native
  def getLocal(): java.lang.String = js.native
  def getLocal(unescape: scala.Boolean): java.lang.String = js.native
  def getResource(): java.lang.String = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-domain
    */
  def setDomain(value: java.lang.String): scala.Unit = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-localpart
    */
  def setLocal(local: java.lang.String): scala.Unit = js.native
  def setLocal(local: java.lang.String, escape: scala.Boolean): scala.Unit = js.native
  /**
    * http://xmpp.org/rfcs/rfc6122.html#addressing-resourcepart
    */
  def setResource(value: java.lang.String): scala.Unit = js.native
  def toString(unescape: scala.Boolean): java.lang.String = js.native
}

