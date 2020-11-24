package typings.twineSugarcube.anon

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends js.Object {
  
  /**
    * Adds an audio group with the given group ID. Groups are useful for applying actions to multiple tracks
    * simultaneously and/or excluding the included tracks from a larger set when applying actions.
    * @param groupId The ID of the group, which will be used to reference it and must begin with a colon.
    * NOTE: There are several predefined group IDs (:all, :looped, :muted, :paused, :playing) and the :not group
    * modifier that cannot be reused/overwritten.
    * @param trackIds The IDs of the tracks to make part of the group, which may be a list of track IDs or an array.
    * @since 2.28.0
    * @example
    * // Set up a group ":ui" with the tracks: "ui_beep", "ui_boop", and "ui_swish"
    * SimpleAudio.groups.add(":ui", "ui_beep", "ui_boop", "ui_swish");
    */
  def add(groupId: String, trackIds: String*): Unit = js.native
  
  /**
    * Deletes all audio groups.
    * NOTE: Only deletes the groups themselves, does not affect their component tracks.
    * @since 2.28.0
    */
  def clear(): Unit = js.native
  
  /**
    * Deletes the audio group with the given group ID.
    * NOTE: Only deletes the group itself, does not affect its component tracks.
    * @param groupId The ID of the group.
    * @since 2.28.0
    * @example
    * SimpleAudio.groups.delete(":ui");
    */
  def delete(groupId: String): Unit = js.native
  
  /**
    * Returns the array of track IDs with the given group ID, or null on failure.
    * NOTE: To actually affect multiple tracks and/or groups, see the SimpleAudio.select() method.
    * @param groupId The ID of the group.
    * @since 2.28.0
    * @example
    * SimpleAudio.groups.get(":ui")  → Returns the array of track IDs matching ":ui"
    */
  def get(groupId: String): Array[String] = js.native
  
  /**
    * Returns whether an audio group with the given group ID exists.
    * @param groupId The ID of the group.
    * @since 2.28.0
    */
  def has(groupId: String): Boolean = js.native
}
object Clear {
  
  @scala.inline
  def apply(
    add: (String, /* repeated */ String) => Unit,
    clear: () => Unit,
    delete: String => Unit,
    get: String => Array[String],
    has: String => Boolean
  ): Clear = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (String, /* repeated */ String) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => Array[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
}
