package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatabaseSchemaJson extends js.Object {
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.undefined
  var stores: js.Array[StoreSchemaJson]
  var version: js.UndefOr[scala.Double] = js.undefined
}

