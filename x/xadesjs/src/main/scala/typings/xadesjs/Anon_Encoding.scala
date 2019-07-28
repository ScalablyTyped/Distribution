package typings.xadesjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var Encoding: String
  var Id: String
  var ObjectReference: String
  var Qualifier: String
  var ReferencedData: String
  var Target: String
  var URI: String
  var Uri: String
}

object Anon_Encoding {
  @scala.inline
  def apply(
    Encoding: String,
    Id: String,
    ObjectReference: String,
    Qualifier: String,
    ReferencedData: String,
    Target: String,
    URI: String,
    Uri: String
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal(Encoding = Encoding, Id = Id, ObjectReference = ObjectReference, Qualifier = Qualifier, ReferencedData = ReferencedData, Target = Target, URI = URI, Uri = Uri)
  
    __obj.asInstanceOf[Anon_Encoding]
  }
}

