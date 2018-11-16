package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TfvcBranch extends TfvcBranchRef {
  /**
       * List of children for the branch.
       */
  var children: js.Array[TfvcBranch]
  /**
       * List of branch mappings.
       */
  var mappings: js.Array[TfvcBranchMapping]
  /**
       * Path of the branch's parent.
       */
  var parent: TfvcShallowBranchRef
  /**
       * List of paths of the related branches.
       */
  var relatedBranches: js.Array[TfvcShallowBranchRef]
}

