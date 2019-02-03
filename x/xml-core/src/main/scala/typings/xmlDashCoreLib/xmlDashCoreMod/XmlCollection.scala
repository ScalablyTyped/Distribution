package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlCollection")
@js.native
class XmlCollection[I /* <: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlObject */] ()
  extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlCollection[I] {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(item: I): scala.Unit = js.native
  /* CompleteClass */
  override def Clear(): scala.Unit = js.native
  /* CompleteClass */
  override def Every(cb: js.Function3[I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def Filter(cb: js.Function3[I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[I] = js.native
  /* CompleteClass */
  override def ForEach(cb: js.Function3[I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def GetIterator(): js.Array[I] = js.native
  /* CompleteClass */
  override def IsEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def Item(index: scala.Double): I | scala.Null = js.native
  /* CompleteClass */
  override def Map[U](cb: js.Function3[I, /* index */ scala.Double, /* array */ js.Array[I], U]): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[U] = js.native
  /* CompleteClass */
  override def Pop(): js.UndefOr[I] = js.native
  /* CompleteClass */
  override def RemoveAt(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def Some(cb: js.Function3[I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def Sort(cb: js.Function2[I, I, scala.Double]): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[I] = js.native
}

/* static members */
@JSImport("xml-core", "XmlCollection")
@js.native
object XmlCollection extends js.Object {
  var parser: js.Any = js.native
}

