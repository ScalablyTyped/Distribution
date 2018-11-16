package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeActionContext extends js.Object {
  /**
       * An array of diagnostics.
       */
  var diagnostics: js.Array[Diagnostic]
  /**
       * Requested kind of actions to return.
       *
       * Actions not of this kind are filtered out by the client before being shown. So servers
       * can omit computing them.
       */
  var only: js.UndefOr[js.Array[CodeActionKind]] = js.undefined
}

