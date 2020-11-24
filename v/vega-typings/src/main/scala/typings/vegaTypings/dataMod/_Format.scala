package typings.vegaTypings.dataMod

import typings.vegaTypings.vegaTypingsStrings.csv
import typings.vegaTypings.vegaTypingsStrings.dsv
import typings.vegaTypings.vegaTypingsStrings.json
import typings.vegaTypings.vegaTypingsStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Format extends js.Object
object _Format {
  
  @scala.inline
  def FormatJSON(`type`: json): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def FormatSV(`type`: csv | tsv): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def FormatDSV(delimiter: String, `type`: dsv): _Format = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  
  @scala.inline
  def Parse(parse: typings.vegaTypings.dataMod.Parse): _Format = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
}
