package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "NamespaceManager")
@js.native
class NamespaceManager ()
  extends xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.NamespaceManager {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override var items: js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace] = js.native
  /* CompleteClass */
  override def Add(item: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace): scala.Unit = js.native
  /* CompleteClass */
  override def Clear(): scala.Unit = js.native
  /* CompleteClass */
  override def Every(
    cb: js.Function3[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      /* index */ scala.Double, 
      /* array */ js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def Filter(
    cb: js.Function3[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      /* index */ scala.Double, 
      /* array */ js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace], 
      scala.Boolean
    ]
  ): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace] = js.native
  /* CompleteClass */
  override def ForEach(
    cb: js.Function3[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      /* index */ scala.Double, 
      /* array */ js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def GetIterator(): js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace] = js.native
  /* CompleteClass */
  override def IsEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def Item(index: scala.Double): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace | scala.Null = js.native
  /* CompleteClass */
  override def Map[U](
    cb: js.Function3[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      /* index */ scala.Double, 
      /* array */ js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace], 
      U
    ]
  ): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[U] = js.native
  /* CompleteClass */
  override def Pop(): js.UndefOr[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace] = js.native
  /* CompleteClass */
  override def RemoveAt(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def Some(
    cb: js.Function3[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      /* index */ scala.Double, 
      /* array */ js.Array[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def Sort(
    cb: js.Function2[
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace, 
      scala.Double
    ]
  ): xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.ICollection[xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNamespace] = js.native
}

