package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildDefinitionReference3_2 extends DefinitionReference {
  var _links: js.Any
  /**
       * The author of the definition.
       */
  var authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * A reference to the definition that this definition is a draft of, if this is a draft definition.
       */
  var draftOf: DefinitionReference
  /**
       * The list of drafts associated with this definition, if this is not a draft definition.
       */
  var drafts: js.Array[DefinitionReference]
  var metrics: js.Array[BuildMetric]
  /**
       * The quality of the definition document (draft, etc.)
       */
  var quality: DefinitionQuality
  /**
       * The default queue for builds run against this definition.
       */
  var queue: AgentPoolQueue
}

