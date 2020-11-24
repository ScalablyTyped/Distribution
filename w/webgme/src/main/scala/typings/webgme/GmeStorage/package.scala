package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object GmeStorage {
  
  type CommitHash = java.lang.String
  
  type CommitHashCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ typings.webgme.GmeStorage.CommitHash, 
    scala.Unit
  ]
  
  type ErrorOnlyCallback = js.Function1[/* err */ typings.std.Error | scala.Null, scala.Unit]
}
