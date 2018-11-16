package typings
package wnumbLib.wNumbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** The number of decimals to include in the result. Limited to 7. */
  var decimals: js.UndefOr[scala.Double] = js.undefined
  /**
           * Reverse the operations set in encoder.
           * Use this option to undo modifications made while encoding the value.
           * function( value ){
           *   return value / 1.32;
           * }
           */
  var decoder: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
  /**
           * Similar to encoder, but applied after all other formatting options are applied.
           */
  var edit: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
  /**
           * This is a powerful option to manually modify the slider output.
           *
           * For example, to show a number in another currency:
           * function( value ){
           *  return value * 1.32;
           * }
           */
  var encoder: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
  /**
           * The decimal separator.
           * Defaults to '.' if thousand isn't already set to '.'.
           */
  var mark: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The prefix for negative values. Defaults to '-' if negativeBefore isn't set.
           */
  var negative: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The prefix for a negative number. Inserted before prefix.
           */
  var negativeBefore: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A number to append to a number. For example: ',-'.
           */
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A string to prepend to the number. Use cases include prefixing with money symbols such as '$' or '€'.
           */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Separator for large numbers. For example: ' ' would result in a formatted number of 1 000 000.
           */
  var thousand: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Similar to decoder and the reverse for edit.
           * Applied before all other formatting options are applied.
           */
  var undo: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Double]] = js.undefined
}

