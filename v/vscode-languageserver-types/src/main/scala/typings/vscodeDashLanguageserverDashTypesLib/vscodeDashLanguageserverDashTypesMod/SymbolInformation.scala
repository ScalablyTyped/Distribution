package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SymbolInformation extends js.Object {
  /**
       * The name of the symbol containing this symbol. This information is for
       * user interface purposes (e.g. to render a qualifier in the user interface
       * if necessary). It can't be used to re-infer a hierarchy for the document
       * symbols.
       */
  var containerName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates if this symbol is deprecated.
       */
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The kind of this symbol.
       */
  var kind: SymbolKind
  /**
       * The location of this symbol. The location's range is used by a tool
       * to reveal the location in the editor. If the symbol is selected in the
       * tool the range's start information is used to position the cursor. So
       * the range usually spans more than the actual symbol's name and does
       * normally include thinks like visibility modifiers.
       *
       * The range doesn't have to denote a node range in the sense of a abstract
       * syntax tree. It can therefore not be used to re-construct a hierarchy of
       * the symbols.
       */
  var location: Location
  /**
       * The name of this symbol.
       */
  var name: java.lang.String
}

