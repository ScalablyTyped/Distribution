package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tokenizer extends js.Object {
  /**
       * The column number of this token in the original code.
       * 0-based index.
       */
  var col: scala.Double
  /**
       * This doesn't apply for comment tokens, but for all other token types it will be an array of comment tokens that were found before.
       */
  var comments_before: js.Array[java.lang.String]
  /**
       * The name of the file where this token originated from. Useful when compressing multiple files at once to generate the proper source map.
       */
  var file: java.lang.String
  /**
       * The line number of this token in the original code.
       * 1-based index.
       */
  var line: scala.Double
  /**
       * Short for "newline before", it's a boolean that tells us whether there was a newline before this node in the original source. It helps for automatic semicolon insertion.
       * For multi-line comments in particular this will be set to true if there either was a newline before this comment, or * * if this comment contains a newline.
       */
  var nlb: scala.Boolean
  /**
       * The type of this token.
       * "comment1" and "comment2" are for single-line, respectively multi-line comments.
       */
  var `type`: terserLib.terserLibStrings.num | terserLib.terserLibStrings.string | terserLib.terserLibStrings.regexp | terserLib.terserLibStrings.operator | terserLib.terserLibStrings.punc | terserLib.terserLibStrings.atom | terserLib.terserLibStrings.name | terserLib.terserLibStrings.keyword | terserLib.terserLibStrings.comment1 | terserLib.terserLibStrings.comment2
  /**
       * The "value" of the token.
       * That's additional information and depends on the token type: "num", "string" and "regexp" tokens you get their literal value.
       * - For "operator" you get the operator.
       * - For "punc" it's the punctuation sign (parens, comma, semicolon etc).
       * - For "atom", "name" and "keyword" it's the name of the identifier
       * - For comments it's the body of the comment (excluding the initial "//" and "/ *".
       */
  var value: java.lang.String
}

