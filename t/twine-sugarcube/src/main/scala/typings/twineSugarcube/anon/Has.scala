package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Has extends js.Object {
  
  /**
    * Empties the story metadata store.
    * @since 2.29.0
    */
  def clear(): Unit = js.native
  
  /**
    * Removes the specified key, and its associated value, from the story metadata store.
    * @param key The key to delete.
    * @since 2.29.0
    * @example
    * // Removes 'achievements' from the metadata store.
    * State.metadata.delete('achievements');
    */
  def delete(key: String): Unit = js.native
  
  /**
    * Returns the value associated with the specified key from the story metadata store.
    * @param key The key whose value should be returned.
    * @since 2.29.0
    * @example
    * // Returns the value of 'achievements' from the metadata store.
    * var playerAchievements = State.metadata.get('achievements');
    */
  def get(key: String): js.Any = js.native
  
  /**
    * Returns whether the specified key exists within the story metadata store.
    * @param key The key whose existence should be tested.
    * @since 2.29.0
    * @example
    * // Returns whether 'achievements' exists within the metadata store.
    * if (State.metadata.has('achievements')) {
    *         // do something
    * }
    */
  def has(key: String): Boolean = js.native
  
  /**
    * Sets the specified key and value within the story metadata store, which causes them to persist over story and browser
    * restarts—n.b. private browsing modes do interfere with this. To update the value associated with a key, simply set it
    * again.
    *
    * **NOTE**: The story metadata, like saves, is tied to the specific story it was generated with. It is not a mechanism
    * for moving data between stories
    *
    * **WARNING**: The story metadata store is not, and should not be used as, a replacement for saves. Examples of good
    * uses: achievement tracking, new game+ data, playthrough statistics, etc.
    *
    * **WARNING**: This feature is largely incompatible with private browsing modes, which cause all in-browser storage
    * mechanisms to either persist only for the lifetime of the browsing session or fail outright.
    * @param key The key that should be set.
    * @param value The value to set.
    * @since 2.29.0
    * @example
    * // Sets 'achievements', with the given value, in the metadata store.
    * State.metadata.set('achievements', { ateYellowSnow : true });
    *
    * // Sets 'ngplus', with the given value, in the metadata store.
    * State.metadata.set('ngplus', true);
    */
  def set(key: String, value: js.Any): Unit = js.native
  
  /**
    * Returns the size of the story metadata store—i.e., the number of stored pairs.
    * @since 2.29.0
    */
  val size: Double = js.native
}
object Has {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    delete: String => Unit,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit,
    size: Double
  ): Has = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Has]
  }
  
  @scala.inline
  implicit class HasOps[Self <: Has] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
