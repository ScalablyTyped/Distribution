package typings.ts3NodejsLibrary.permissionMod

import typings.ts3NodejsLibrary.permissionMod.Permission.IConfig
import typings.ts3NodejsLibrary.permissionMod.Permission.PermId
import typings.ts3NodejsLibrary.permissionMod.Permission.PermSid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/util/Permission", "Permission")
@js.native
class Permission_[T /* <: js.Object */] protected () extends js.Object {
  def this(config: IConfig[T]) = this()
  var _negate: js.Any = js.native
  var _perm: js.Any = js.native
  var _skip: js.Any = js.native
  var _value: js.Any = js.native
  var cmdRemove: js.Any = js.native
  var cmdUpdate: js.Any = js.native
  var context: js.Any = js.native
  /** retrieves a raw object with permid */
  var getAsPermId: js.Any = js.native
  /** retrieves a raw object with permsid */
  var getAsPermSid: js.Any = js.native
  /** retrieves skip and negate flags */
  var getFlags: js.Any = js.native
  /** retrieves the correct permission name */
  var getPermName: js.Any = js.native
  var teamspeak: js.Any = js.native
  var withSkipNegate: js.Any = js.native
  /** retrieves the permission object */
  def get(): PermId | PermSid = js.native
  /** retrieves wether negate has been set */
  def getNegate(): Boolean = js.native
  /** retrieves the current permission */
  def getPerm(): js.UndefOr[String | Double] = js.native
  /** retrieves wether skip has been set */
  def getSkip(): Boolean = js.native
  /** retrieves the permission value */
  def getValue(): Double = js.native
  /** sets/gets the negate value */
  def negate(negate: Boolean): Permission[T] = js.native
  /** sets/gets the permid or permsid */
  def perm(perm: String): Permission[T] = js.native
  def perm(perm: Double): Permission[T] = js.native
  /** removes the specified permission */
  def remove(): js.Promise[js.Array[js.Any]] = js.native
  /** sets/gets the skip value */
  def skip(skip: Boolean): Permission[T] = js.native
  /** updates or adds the permission to the teamspeak server */
  def update(): js.Promise[js.Array[js.Any]] = js.native
  /** sets/gets the value for the permission */
  def value(value: Double): Permission[T] = js.native
}

