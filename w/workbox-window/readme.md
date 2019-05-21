
# Scala.js typings for workbox-window

Typings are for version 4.3

## Library description:
Simplifies communications with Workbox packages running in the service worker

|                    |                 |
| ------------------ | :-------------: |
| Full name          | workbox-window |
| Keywords           | workbox, workboxjs, service worker, sw, window, message, postMessage |
| # releases         | 15 |
| # dependents       | 3 |
| # downloads        | 830329 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/GoogleChrome/workbox)
- [Bugs](https://github.com/googlechrome/workbox/issues)
- [Repository](https://github.com/googlechrome/workbox)
- [Npm](https://www.npmjs.com/package/workbox-window)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for workbox-window 4.3
// Project: https://github.com/GoogleChrome/workbox/tree/master/packages/workbox-window, https://github.com/GoogleChrome/workbox
// Definitions by: Yamagishi Kazutoshi <https://github.com/ykzts>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.0
/**
 * Sends a data object to a service worker via `postMessage` and resolves with
 * a response (if any).
 *
 * A response can be set in a message handler in the service worker by
 * calling `event.ports[0].postMessage(...)`, which will resolve the promise
 * returned by `messageSW()`. If no response is set, the promise will not
 * resolve.
 */

```

