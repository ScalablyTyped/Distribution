package typings.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "Collection")
@js.native
class Collection[I] () extends ICollection[I] {
  def this(items: js.Array[I]) = this()
  /* CompleteClass */
  override val Count: Double = js.native
  var items: js.Array[I] = js.native
  /* CompleteClass */
  override def Add(item: I): Unit = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  @JSName("Count")
  def Count_MCollection(): Double = js.native
  /* CompleteClass */
  override def Every(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  /* CompleteClass */
  override def Filter(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I] = js.native
  /* CompleteClass */
  override def ForEach(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit = js.native
  /* CompleteClass */
  override def GetIterator(): js.Array[I] = js.native
  /* CompleteClass */
  override def IsEmpty(): Boolean = js.native
  /* CompleteClass */
  override def Item(index: Double): I | Null = js.native
  /* CompleteClass */
  override def Map[U](cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U] = js.native
  /* CompleteClass */
  override def Pop(): js.UndefOr[I] = js.native
  /* CompleteClass */
  override def RemoveAt(index: Double): Unit = js.native
  /* CompleteClass */
  override def Some(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  /* CompleteClass */
  override def Sort(cb: js.Function2[I, I, Double]): ICollection[I] = js.native
}

