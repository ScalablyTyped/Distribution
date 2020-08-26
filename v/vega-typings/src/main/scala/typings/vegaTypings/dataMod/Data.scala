package typings.vegaTypings.dataMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.dataMod.SourceData
  - typings.vegaTypings.dataMod.ValuesData
  - typings.vegaTypings.dataMod.UrlData
  - typings.vegaTypings.dataMod.BaseData
*/
trait Data extends js.Object

object Data {
  @scala.inline
  def SourceData(name: String, source: String | js.Array[String]): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def ValuesData(name: String, values: js.Array[Datum] | js.Object): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def UrlData(name: String, url: String | SignalRef): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  def BaseData(name: String): Data = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

