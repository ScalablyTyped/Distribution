package typings.xml.xmlMod

import org.scalablytyped.runtime.NumberDictionary
import typings.xml.Anon_Attr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlDescArray
  extends /* index */ NumberDictionary[Anon_Attr | XmlObject]
     with _XmlDesc

object XmlDescArray {
  @scala.inline
  def apply(NumberDictionary: /* index */ NumberDictionary[Anon_Attr | XmlObject] = null): XmlDescArray = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[XmlDescArray]
  }
}

