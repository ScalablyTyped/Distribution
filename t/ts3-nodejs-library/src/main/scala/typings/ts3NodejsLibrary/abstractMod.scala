package typings.ts3NodejsLibrary

import typings.std.Record
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponse
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Abstract", JSImport.Namespace)
@js.native
object abstractMod extends js.Object {
  @js.native
  abstract class Abstract protected () extends js.Object {
    def this(parent: TeamSpeak, props: QueryResponse, namespace: String) = this()
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
    def getPropertyByName[T /* <: String */](name: T): /* import warning: importer.ImportType#apply Failed type conversion: ts3-nodejs-library.ts3-nodejs-library/lib/types/QueryResponse.QueryResponse[T] */ js.Any = js.native
    /** returns JSONifyable data */
    def toJSON(): Record[String, _] = js.native
    def toJSON(includeNameSpace: Boolean): Record[String, _] = js.native
    /** updates the cache with the given object */
    def updateCache(props: QueryResponse): this.type = js.native
  }
  
}

