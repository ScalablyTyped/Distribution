package typings
package webgmeLib.GmeStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitObject extends js.Object {
  /**
    * Hash of the commit object, a.k.a commitHash.
    */
  var _id: CommitHash
  /**
    * Commit message.
    */
  var message: java.lang.String
  /**
    * Commits from where this commit evolved.
    */
  var parents: js.Array[CommitHash]
  /**
    * Hash of the associated root object, a.k.a. rootHash.
    */
  var root: webgmeLib.CoreNs.ObjectHash
  /**
    * When the commit object was created (new Date()).getTime().
    */
  var time: scala.Double
  /**
    * A constant 'commit'.
    */
  var `type`: java.lang.String
  /**
    * Who performed the update.
    */
  var updater: js.Array[java.lang.String]
}

