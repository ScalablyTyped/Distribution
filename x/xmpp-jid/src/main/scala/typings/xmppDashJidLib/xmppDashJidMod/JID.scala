package typings
package xmppDashJidLib.xmppDashJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmpp-jid", "JID")
@js.native
class JID protected () extends ParsedJID {
  def this(localOrJID: java.lang.String) = this()
  def this(localOrJID: JID) = this()
  def this(localOrJID: java.lang.String, domain: java.lang.String) = this()
  def this(localOrJID: JID, domain: java.lang.String) = this()
  def this(localOrJID: java.lang.String, domain: java.lang.String, resource: java.lang.String) = this()
  def this(localOrJID: JID, domain: java.lang.String, resource: java.lang.String) = this()
  /* CompleteClass */
  override var bare: java.lang.String = js.native
  /* CompleteClass */
  override var domain: java.lang.String = js.native
  /* CompleteClass */
  override var full: java.lang.String = js.native
  @JSName("local")
  var local_JID: java.lang.String = js.native
  @JSName("prepped")
  var prepped_JID: scala.Boolean = js.native
  @JSName("resource")
  var resource_JID: java.lang.String = js.native
  @JSName("unescapedBare")
  var unescapedBare_JID: java.lang.String = js.native
  @JSName("unescapedFull")
  var unescapedFull_JID: java.lang.String = js.native
  @JSName("unescapedLocal")
  var unescapedLocal_JID: java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

