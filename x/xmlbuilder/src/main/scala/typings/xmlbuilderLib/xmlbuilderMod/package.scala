package typings
package xmlbuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlbuilderMod {
  type XMLStringifier = org.scalablytyped.runtime.StringDictionary[(js.Function1[/* v */ js.Any, java.lang.String]) | java.lang.String]
  type XMLWriter = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* e */ XMLElementOrXMLNode, 
      /* options */ WriterOptions, 
      /* level */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ]
}
