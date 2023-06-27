package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoSIM
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the Integrated Circuit Card ID.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val iccid: String
  
  /**
    * Represents the Mobile Country Code (MCC) of SIM provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val mcc: Double
  
  /**
    * Represents the Mobile Network Code (MNC) of SIM provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val mnc: Double
  
  /**
    * Represents the Mobile Subscription Identification Number (MSIN) of SIM provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/telephony
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    * @warning 2.4 The partner level privilege, _http://tizen.org/privilege/systemmanager_, has been deprecated. From Tizen 2.4, the public level privilege, _http://tizen.org/privilege/telephony_, is required.
    */
  val msin: String
  
  /**
    * Represents the SIM card subscriber number.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/telephony
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    *
    * @warning 2.4 The partner level privilege, _http://tizen.org/privilege/systemmanager_, has been deprecated. From Tizen 2.4, the public level privilege, _http://tizen.org/privilege/telephony_, is required.
    */
  val msisdn: String
  
  /**
    * Represents the Operator Name String (ONS) of Common PCN Handset Specification (CPHS) in SIM card.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val operatorName: String
  
  /**
    * Represents the Service Provider Name (SPN) of SIM card.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val spn: String
  
  /**
    * Represents the SIM card state.
    *
    * @since 2.1
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/system
    *
    * @throws WebAPIException with error type SecurityError, if this attribute is not allowed.
    */
  val state: SystemInfoSimState
}
object SystemInfoSIM {
  
  inline def apply(
    iccid: String,
    mcc: Double,
    mnc: Double,
    msin: String,
    msisdn: String,
    operatorName: String,
    spn: String,
    state: SystemInfoSimState
  ): SystemInfoSIM = {
    val __obj = js.Dynamic.literal(iccid = iccid.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], msin = msin.asInstanceOf[js.Any], msisdn = msisdn.asInstanceOf[js.Any], operatorName = operatorName.asInstanceOf[js.Any], spn = spn.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoSIM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoSIM] (val x: Self) extends AnyVal {
    
    inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
    
    inline def setMcc(value: Double): Self = StObject.set(x, "mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: Double): Self = StObject.set(x, "mnc", value.asInstanceOf[js.Any])
    
    inline def setMsin(value: String): Self = StObject.set(x, "msin", value.asInstanceOf[js.Any])
    
    inline def setMsisdn(value: String): Self = StObject.set(x, "msisdn", value.asInstanceOf[js.Any])
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setSpn(value: String): Self = StObject.set(x, "spn", value.asInstanceOf[js.Any])
    
    inline def setState(value: SystemInfoSimState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
