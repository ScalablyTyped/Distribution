package typings.ts3NodejsLibrary

import typings.std.Record
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Abstract", JSImport.Namespace)
@js.native
object abstractMod extends js.Object {
  @js.native
  abstract class Abstract[T /* <: ResponseEntry */] protected () extends js.Object {
    def this(parent: TeamSpeak, props: T, namespace: String) = this()
    var namespace: js.Any = js.native
    var parent: js.Any = js.native
    var propcache: js.Any = js.native
    /** retrieves the namespace of this class */
    def getNameSpace(): String = js.native
    /** returns the parent class */
    def getParent(): TeamSpeak = js.native
    /**
      * retrieves a single property value by the given name
      * @param name the name from where the value should be retrieved
      */
    def getPropertyByName[Y /* <: /* keyof T */ String */](name: Y): /* import warning: importer.ImportType#apply Failed type conversion: T[Y] */ js.Any = js.native
    /** returns JSONifyable data */
    def toJSON(): Record[String, _] = js.native
    def toJSON(includeNameSpace: Boolean): Record[String, _] = js.native
    /** updates the cache with the given object */
    def updateCache(props: ResponseEntry): this.type = js.native
  }
  
}

