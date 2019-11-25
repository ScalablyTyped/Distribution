package typings.trieDashPrefixDashTree

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddWord extends js.Object {
  /**
    * Add a new word to the trie
    */
  def addWord(word: String): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof Trie */ js.Any
  ] = js.native
  /**
    * Count the number of words with the given prefixSearch
    * @returns Number
    */
  def countPrefix(word: String): Double = js.native
  /**
    * Get a string representation of the trie
    */
  def dump(): String = js.native
  def dump(spacer: Double): String = js.native
  /**
    * Get a list of valid anagrams that can be made from the given letters
    * @returns Array
    */
  def getAnagrams(word: String): js.Array[String] = js.native
  /**
    * Get a list of all words in the trie with the given prefix
    * @returns Array
    */
  def getPrefix(word: String): js.Array[String] = js.native
  def getPrefix(word: String, sort: Boolean): js.Array[String] = js.native
  /**
    * Get a random word in the trie with the given prefix
    * @returns Array
    */
  def getRandomWordWithPrefix(prefix: String): String = js.native
  /**
    * Get a list of all sub-anagrams that can be made from the given letters
    * @returns Array
    */
  def getSubAnagrams(word: String): js.Array[String] = js.native
  /**
    * Get all words in the trie
    * @returns Array
    */
  def getWords(): js.Array[String] = js.native
  def getWords(sorted: Boolean): js.Array[String] = js.native
  /**
    * Check the existence of a word in the trie
    * @returns Boolean
    */
  def hasWord(word: String): Boolean = js.native
  /**
    * Check a prefix is valid
    * @returns Boolean
    */
  def isPrefix(word: String): Boolean = js.native
  /**
    * Remove an existing word from the trie
    */
  def removeWord(word: String): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof Trie */ js.Any
  ] = js.native
  /**
    * Get the generated raw trie object
    */
  def tree(): js.Any = js.native
}

