package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type CreateObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Event}
    */ typings.testingLibraryDom.testingLibraryDomStrings.CreateObject with js.Any
  type FireFunction = js.Function2[
    /* element */ typings.std.Document_ | typings.std.Element | typings.std.Window_, 
    /* event */ typings.std.Event_, 
    scala.Boolean
  ]
  type FireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): boolean}
    */ typings.testingLibraryDom.testingLibraryDomStrings.FireObject with js.Any
}
