package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// types
/**
  * Base interface for collections
  * 
  * @interface ICollection
  * @template I
  */
trait ICollection[I] extends js.Object {
  val Count: scala.Double
  def Add(item: I): scala.Unit
  def Clear(): scala.Unit
  def Every(cb: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean
  def Filter(cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): ICollection[I]
  def ForEach(cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit]): scala.Unit
  def GetIterator(): js.Array[I]
  def IsEmpty(): scala.Boolean
  def Item(index: scala.Double): I | scala.Null
  def Map[U](cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], U]): ICollection[U]
  def Pop(): js.UndefOr[I]
  def RemoveAt(index: scala.Double): scala.Unit
  def Some(cb: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, scala.Double]): ICollection[I]
}

