package typings.stripe.anon

import typings.stripe.mod.Stripe.Address
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Person.AddressKana
import typings.stripe.mod.Stripe.Person.AddressKanji
import typings.stripe.mod.Stripe.Person.Dob
import typings.stripe.mod.Stripe.Person.FutureRequirements
import typings.stripe.mod.Stripe.Person.PoliticalExposure
import typings.stripe.mod.Stripe.Person.Relationship
import typings.stripe.mod.Stripe.Person.Requirements
import typings.stripe.mod.Stripe.Person.Verification
import typings.stripe.stripeStrings.person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Person> */
trait ResponsePerson extends StObject {
  
  /**
    * The account the person is associated with.
    */
  var account: String
  
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * The Kana variation of the person's address (Japan only).
    */
  var address_kana: js.UndefOr[AddressKana | Null] = js.undefined
  
  /**
    * The Kanji variation of the person's address (Japan only).
    */
  var address_kanji: js.UndefOr[AddressKanji | Null] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  var dob: js.UndefOr[Dob] = js.undefined
  
  /**
    * The person's email address.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person's first name.
    */
  var first_name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Kana variation of the person's first name (Japan only).
    */
  var first_name_kana: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Kanji variation of the person's first name (Japan only).
    */
  var first_name_kanji: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of alternate names or aliases that the person is known by.
    */
  var full_name_aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about the upcoming new requirements for this person, including what information needs to be collected, and by when.
    */
  var future_requirements: js.UndefOr[FutureRequirements | Null] = js.undefined
  
  /**
    * The person's gender (International regulations require either "male" or "female").
    */
  var gender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Whether the person's `id_number` was provided.
    */
  var id_number_provided: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the person's `id_number_secondary` was provided.
    */
  var id_number_secondary_provided: js.UndefOr[Boolean] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * The person's last name.
    */
  var last_name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Kana variation of the person's last name (Japan only).
    */
  var last_name_kana: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Kanji variation of the person's last name (Japan only).
    */
  var last_name_kanji: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person's maiden name.
    */
  var maiden_name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  /**
    * The country where the person is a national.
    */
  var nationality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: person
  
  /**
    * The person's phone number.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if the person or any of their representatives, family members, or other closely related persons, declares that they hold or have held an important public job or function, in any jurisdiction.
    */
  var political_exposure: js.UndefOr[PoliticalExposure] = js.undefined
  
  var registered_address: js.UndefOr[Address] = js.undefined
  
  var relationship: js.UndefOr[Relationship] = js.undefined
  
  /**
    * Information about the requirements for this person, including what information needs to be collected, and by when.
    */
  var requirements: js.UndefOr[Requirements | Null] = js.undefined
  
  /**
    * Whether the last four digits of the person's Social Security number have been provided (U.S. only).
    */
  var ssn_last_4_provided: js.UndefOr[Boolean] = js.undefined
  
  var verification: js.UndefOr[Verification] = js.undefined
}
object ResponsePerson {
  
  inline def apply(account: String, created: Double, id: String, lastResponse: ApiVersion): ResponsePerson = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("person")
    __obj.asInstanceOf[ResponsePerson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePerson] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddress_kana(value: AddressKana): Self = StObject.set(x, "address_kana", value.asInstanceOf[js.Any])
    
    inline def setAddress_kanaNull: Self = StObject.set(x, "address_kana", null)
    
    inline def setAddress_kanaUndefined: Self = StObject.set(x, "address_kana", js.undefined)
    
    inline def setAddress_kanji(value: AddressKanji): Self = StObject.set(x, "address_kanji", value.asInstanceOf[js.Any])
    
    inline def setAddress_kanjiNull: Self = StObject.set(x, "address_kanji", null)
    
    inline def setAddress_kanjiUndefined: Self = StObject.set(x, "address_kanji", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDob(value: Dob): Self = StObject.set(x, "dob", value.asInstanceOf[js.Any])
    
    inline def setDobUndefined: Self = StObject.set(x, "dob", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameNull: Self = StObject.set(x, "first_name", null)
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setFirst_name_kana(value: String): Self = StObject.set(x, "first_name_kana", value.asInstanceOf[js.Any])
    
    inline def setFirst_name_kanaNull: Self = StObject.set(x, "first_name_kana", null)
    
    inline def setFirst_name_kanaUndefined: Self = StObject.set(x, "first_name_kana", js.undefined)
    
    inline def setFirst_name_kanji(value: String): Self = StObject.set(x, "first_name_kanji", value.asInstanceOf[js.Any])
    
    inline def setFirst_name_kanjiNull: Self = StObject.set(x, "first_name_kanji", null)
    
    inline def setFirst_name_kanjiUndefined: Self = StObject.set(x, "first_name_kanji", js.undefined)
    
    inline def setFull_name_aliases(value: js.Array[String]): Self = StObject.set(x, "full_name_aliases", value.asInstanceOf[js.Any])
    
    inline def setFull_name_aliasesUndefined: Self = StObject.set(x, "full_name_aliases", js.undefined)
    
    inline def setFull_name_aliasesVarargs(value: String*): Self = StObject.set(x, "full_name_aliases", js.Array(value*))
    
    inline def setFuture_requirements(value: FutureRequirements): Self = StObject.set(x, "future_requirements", value.asInstanceOf[js.Any])
    
    inline def setFuture_requirementsNull: Self = StObject.set(x, "future_requirements", null)
    
    inline def setFuture_requirementsUndefined: Self = StObject.set(x, "future_requirements", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_number_provided(value: Boolean): Self = StObject.set(x, "id_number_provided", value.asInstanceOf[js.Any])
    
    inline def setId_number_providedUndefined: Self = StObject.set(x, "id_number_provided", js.undefined)
    
    inline def setId_number_secondary_provided(value: Boolean): Self = StObject.set(x, "id_number_secondary_provided", value.asInstanceOf[js.Any])
    
    inline def setId_number_secondary_providedUndefined: Self = StObject.set(x, "id_number_secondary_provided", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameNull: Self = StObject.set(x, "last_name", null)
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setLast_name_kana(value: String): Self = StObject.set(x, "last_name_kana", value.asInstanceOf[js.Any])
    
    inline def setLast_name_kanaNull: Self = StObject.set(x, "last_name_kana", null)
    
    inline def setLast_name_kanaUndefined: Self = StObject.set(x, "last_name_kana", js.undefined)
    
    inline def setLast_name_kanji(value: String): Self = StObject.set(x, "last_name_kanji", value.asInstanceOf[js.Any])
    
    inline def setLast_name_kanjiNull: Self = StObject.set(x, "last_name_kanji", null)
    
    inline def setLast_name_kanjiUndefined: Self = StObject.set(x, "last_name_kanji", js.undefined)
    
    inline def setMaiden_name(value: String): Self = StObject.set(x, "maiden_name", value.asInstanceOf[js.Any])
    
    inline def setMaiden_nameNull: Self = StObject.set(x, "maiden_name", null)
    
    inline def setMaiden_nameUndefined: Self = StObject.set(x, "maiden_name", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNationality(value: String): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
    
    inline def setNationalityNull: Self = StObject.set(x, "nationality", null)
    
    inline def setNationalityUndefined: Self = StObject.set(x, "nationality", js.undefined)
    
    inline def setObject(value: person): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPolitical_exposure(value: PoliticalExposure): Self = StObject.set(x, "political_exposure", value.asInstanceOf[js.Any])
    
    inline def setPolitical_exposureUndefined: Self = StObject.set(x, "political_exposure", js.undefined)
    
    inline def setRegistered_address(value: Address): Self = StObject.set(x, "registered_address", value.asInstanceOf[js.Any])
    
    inline def setRegistered_addressUndefined: Self = StObject.set(x, "registered_address", js.undefined)
    
    inline def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setRequirements(value: Requirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsNull: Self = StObject.set(x, "requirements", null)
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSsn_last_4_provided(value: Boolean): Self = StObject.set(x, "ssn_last_4_provided", value.asInstanceOf[js.Any])
    
    inline def setSsn_last_4_providedUndefined: Self = StObject.set(x, "ssn_last_4_provided", js.undefined)
    
    inline def setVerification(value: Verification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
