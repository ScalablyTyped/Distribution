package typings
package trieDashPrefixDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddWord extends js.Object {
  /**
    * Add a new word to the trie
    */
  def addWord(word: java.lang.String): stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof Trie */ js.Any
  ] = js.native
  /**
    * Count the number of words with the given prefixSearch
    * @returns Number
    */
  def countPrefix(word: java.lang.String): scala.Double = js.native
  /**
    * Get a string representation of the trie
    */
  def dump(): java.lang.String = js.native
  def dump(spacer: scala.Double): java.lang.String = js.native
  /**
    * Get a list of valid anagrams that can be made from the given letters
    * @returns Array
    */
  def getAnagrams(word: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Get a list of all words in the trie with the given prefix
    * @returns Array
    */
  def getPrefix(word: java.lang.String): js.Array[java.lang.String] = js.native
  def getPrefix(word: java.lang.String, sort: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
    * Get a random word in the trie with the given prefix
    * @returns Array
    */
  def getRandomWordWithPrefix(prefix: java.lang.String): java.lang.String = js.native
  /**
    * Get a list of all sub-anagrams that can be made from the given letters
    * @returns Array
    */
  def getSubAnagrams(word: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Get all words in the trie
    * @returns Array
    */
  def getWords(): js.Array[java.lang.String] = js.native
  def getWords(sorted: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
    * Check the existence of a word in the trie
    * @returns Boolean
    */
  def hasWord(word: java.lang.String): scala.Boolean = js.native
  /**
    * Check a prefix is valid
    * @returns Boolean
    */
  def isPrefix(word: java.lang.String): scala.Boolean = js.native
  /**
    * Remove an existing word from the trie
    */
  def removeWord(word: java.lang.String): stdLib.ReturnType[
    /* import warning: ImportType.apply Failed type conversion: typeof Trie */ js.Any
  ] = js.native
  /**
    * Get the generated raw trie object
    */
  def tree(): js.Any = js.native
}

