```
// Type definitions for non-npm package W3C (WebAppSec) Credential Management API Level 1, 0.3
// Project: https://github.com/w3c/webappsec-credential-management
// Definitions by: Iain McGinniss <https://github.com/iainmcgin>
//                 Joao Peixoto <https://github.com/Hartimer>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.7
// Spec: https://www.w3.org/TR/2017/WD-credential-management-1-20170804
/* ************************* FETCH MODIFICATIONS *******************************
 * The credential management spec modifies fetch(), by adding a new
 * "request credentials mode", and permitting a PasswordCredential to be passed
 * as part of 'credentials' init parameter. As we cannot directly modify
 * the types defined in whatwg-fetch (especially for a draft spec), we
 * define a variant of the fetch() method here that includes the changes.
 *
 * See: https://www.w3.org/TR/credential-management-1/#monkey-patching
 * ************************************************************************** */

```