package typings.umzug.umzugMod

import typings.node.eventsMod.EventEmitter
import typings.umzug.umzugStrings.migrated
import typings.umzug.umzugStrings.migrating
import typings.umzug.umzugStrings.reverted
import typings.umzug.umzugStrings.reverting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Umzug extends EventEmitter {
  @JSName("addListener")
  def addListener_migrated(eventName: migrated): this.type = js.native
  @JSName("addListener")
  def addListener_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_migrating(eventName: migrating): this.type = js.native
  @JSName("addListener")
  def addListener_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reverted(eventName: reverted): this.type = js.native
  @JSName("addListener")
  def addListener_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reverting(eventName: reverting): this.type = js.native
  @JSName("addListener")
  def addListener_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  /**
    * The down method can be used to revert the last executed migration.
    */
  def down(): js.Promise[js.Array[Migration]] = js.native
  def down(migration: String): js.Promise[js.Array[Migration]] = js.native
  def down(migrations: js.Array[String]): js.Promise[js.Array[Migration]] = js.native
  def down(options: DownToOptions): js.Promise[js.Array[Migration]] = js.native
  def down(options: UpDownMigrationsOptions): js.Promise[js.Array[Migration]] = js.native
  /**
    * The execute method is a general purpose function that runs for
    * every specified migrations the respective function.
    */
  def execute(): js.Promise[js.Array[Migration]] = js.native
  def execute(options: ExecuteOptions): js.Promise[js.Array[Migration]] = js.native
  /**
    * You can get a list of already executed migrations like this:
    */
  def executed(): js.Promise[js.Array[Migration]] = js.native
  @JSName("on")
  def on_migrated(eventName: migrated): this.type = js.native
  @JSName("on")
  def on_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("on")
  def on_migrating(eventName: migrating): this.type = js.native
  @JSName("on")
  def on_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("on")
  def on_reverted(eventName: reverted): this.type = js.native
  @JSName("on")
  def on_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("on")
  def on_reverting(eventName: reverting): this.type = js.native
  @JSName("on")
  def on_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  /**
    * You can get a list of pending/not yet executed migrations like this:
    */
  def pending(): js.Promise[js.Array[Migration]] = js.native
  @JSName("removeListener")
  def removeListener_migrated(eventName: migrated): this.type = js.native
  @JSName("removeListener")
  def removeListener_migrated(eventName: migrated, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_migrating(eventName: migrating): this.type = js.native
  @JSName("removeListener")
  def removeListener_migrating(eventName: migrating, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_reverted(eventName: reverted): this.type = js.native
  @JSName("removeListener")
  def removeListener_reverted(eventName: reverted, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_reverting(eventName: reverting): this.type = js.native
  @JSName("removeListener")
  def removeListener_reverting(eventName: reverting, cb: js.Function2[/* name */ String, /* migration */ Migration, Unit]): this.type = js.native
  /**
    * The up method can be used to execute all pending migrations.
    */
  def up(): js.Promise[js.Array[Migration]] = js.native
  def up(migration: String): js.Promise[js.Array[Migration]] = js.native
  def up(migrations: js.Array[String]): js.Promise[js.Array[Migration]] = js.native
  def up(options: UpDownMigrationsOptions): js.Promise[js.Array[Migration]] = js.native
  def up(options: UpToOptions): js.Promise[js.Array[Migration]] = js.native
}

