package typings.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  import typings.std.Document
  import typings.std.Element
  import typings.std.Event
  import typings.std.Window

  type CreateObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Event}
    */ typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.CreateObject with js.Any
  type FireFunction = js.Function2[/* element */ Document | Element | Window, /* event */ Event, Boolean]
  type FireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): boolean}
    */ typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.FireObject with js.Any
}
