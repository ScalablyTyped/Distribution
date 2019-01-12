package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webixLib {
  type DataCollectionEventName = webixLib.webixLibStrings.onAfterAdd | webixLib.webixLibStrings.onAfterCursorChange | webixLib.webixLibStrings.onAfterDelete | webixLib.webixLibStrings.onAfterLoad | webixLib.webixLibStrings.onAfterSort | webixLib.webixLibStrings.onBeforeAdd | webixLib.webixLibStrings.onBeforeCursorChange | webixLib.webixLibStrings.onBeforeDelete | webixLib.webixLibStrings.onBeforeLoad | webixLib.webixLibStrings.onBeforeSort | webixLib.webixLibStrings.onBindRequest | webixLib.webixLibStrings.onBindUpdate | webixLib.webixLibStrings.onDataRequest | webixLib.webixLibStrings.onDataUpdate | webixLib.webixLibStrings.onDestruct | webixLib.webixLibStrings.onLoadError | webixLib.webixLibStrings.onValidationError | webixLib.webixLibStrings.onValidationSuccess
  type TreeCollectionEventName = webixLib.webixLibStrings.onAfterAdd | webixLib.webixLibStrings.onAfterCursorChange | webixLib.webixLibStrings.onAfterDelete | webixLib.webixLibStrings.onAfterLoad | webixLib.webixLibStrings.onAfterSort | webixLib.webixLibStrings.onBeforeAdd | webixLib.webixLibStrings.onBeforeCursorChange | webixLib.webixLibStrings.onBeforeDelete | webixLib.webixLibStrings.onBeforeLoad | webixLib.webixLibStrings.onBeforeSort | webixLib.webixLibStrings.onBindRequest | webixLib.webixLibStrings.onBindUpdate | webixLib.webixLibStrings.onDataRequest | webixLib.webixLibStrings.onDataUpdate | webixLib.webixLibStrings.onDestruct | webixLib.webixLibStrings.onLoadError | webixLib.webixLibStrings.onValidationError | webixLib.webixLibStrings.onValidationSuccess
  type WebixCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type WebixTemplate = js.Function1[/* repeated */ js.Any, java.lang.String]
}
