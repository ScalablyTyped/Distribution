package typings
package vfileLib.vfileMod.vfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * File-related message describing something at certain position.
     */

trait VFileMessage extends js.Object {
  /**
           * Starting column of error.
           */
  var column: scala.Double | scala.Null
  /**
           * If true, marks associated file as no longer processable.
           */
  var fatal: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
           * File-path, when the message was triggered.
           */
  var file: java.lang.String
  /**
           * Starting line of error.
           */
  var line: scala.Double | scala.Null
  /**
           * Full range information, when available.
           * Has start and end properties, both set to an object with line and column, set to number?.
           */
  var location: unistLib.unistMod.Position
  /**
           * Reason for message.
           */
  var reason: java.lang.String
  /**
           * Category of message.
           */
  var ruleId: java.lang.String | scala.Null
  /**
           * Namespace of warning.
           */
  var source: java.lang.String | scala.Null
}

