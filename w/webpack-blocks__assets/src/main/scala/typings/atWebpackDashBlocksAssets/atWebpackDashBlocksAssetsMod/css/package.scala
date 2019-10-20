package typings.atWebpackDashBlocksAssets.atWebpackDashBlocksAssetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object css {
  type GetLocalIdent = js.Function4[
    /* context */ js.Any, 
    /* localIdentName */ js.Any, 
    /* localName */ js.Any, 
    /* options */ js.Any, 
    String
  ]
  type ImportFilter = js.Function2[/* parseImport */ ParseImportOptions, /* resourcePath */ String, Boolean]
  type NameFunction = js.Function1[/* file */ String, js.Any]
  type PathFunction = js.Function3[/* url */ String, /* resourcePath */ String, /* context */ String, js.Any]
  type UrlFilter = js.Function2[/* url */ String, /* resourcePath */ String, Boolean]
}
